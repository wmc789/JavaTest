package de.cse.aoe.example

import de.cse.aoe.BaseTableConfig
import de.cse.aoe.BaseTableConfig.LayoutSize
import de.cse.aoe.BaseTableConfig.LimitOptions
import de.cse.aoe.BaseTableConfig.TableFilterType
import de.cse.aoe.TableConfigDataEnum
import de.cse.aoe.TableFieldEnum
import de.cse.aoe.TableFilterEnum

/**
 * Created by sahlers on 25.10.16.
 */
class TableConfig extends BaseTableConfig {


    static enum TableFilter implements TableFilterEnum {
        SEARCH(null, new LayoutSize(12, 12, 4, 2), null, TableFilterType.SEARCH, "/templates/tableConfigStorage/filter/configFilterSearch", null, "aoe-table-config-storage"),
        LIMIT(null, new LayoutSize(12, 12, 4, 2), null, TableFilterType.LIMIT, "/templates/tableConfigStorage/filter/configFilterLimit", null, "aoe-table-config-storage"),
        RANGE("/templates/filter/filterRange", new LayoutSize(12, 12, 4, 3), [name: 'range', changeEvent: 'hide.daterangepicker', multiValues: true, multiValueSelectors: [
                [name: 'startDate', triggerChange: true],
                [name: 'endDate', triggerChange: true]]
        ], TableFilterType.DATERANGE, "/templates/tableConfigStorage/filter/configFilterRange", null, "aoe-table-config-storage"),
        SEARCH_WITH_FILTER_TYPE("/templates/filter/filterType", new LayoutSize(12, 12, 6, 4), [overrideOnInit: true], TableFilterType.SEARCH, "/templates/filter/configFilterSearch", null, "aoe-table-config-storage"),

        ENABLED("/templates/filter/filterStatus", new LayoutSize(12, 12, 4, 2), [name: "enabled"], TableFilterType.SELECT),

        private String templatePath
        private LayoutSize layoutSize
        private Map additionalFilter
        private TableFilterType filterType
        private String configTemplatePath
        private String templatePlugin
        private String configTemplatePlugin

        @Override
        String getTemplatePath() {
            return templatePath
        }

        @Override
        void setTemplatePath(String templatePath) {
            this.templatePath = templatePath
        }

        @Override
        String getTemplatePlugin() {
            return templatePlugin
        }

        @Override
        void setTemplatePlugin(String plugin) {
            templatePlugin = plugin
        }

        @Override
        LayoutSize getLayoutSize() {
            return layoutSize
        }

        @Override
        void setLayoutSize(LayoutSize layoutSize) {
            this.layoutSize = layoutSize
        }

        @Override
        Map getAdditionalFilter() {
            return additionalFilter
        }

        @Override
        void setAdditionalFilter(Map additionalFilter) {
            this.additionalFilter = additionalFilter
        }

        @Override
        TableFilterType getFilterType() {
            return filterType
        }

        @Override
        void setFilterType(TableFilterType filterType) {
            this.filterType = filterType
        }

        @Override
        String getConfigTemplatePath() {
            return configTemplatePath
        }

        @Override
        void setConfigTemplatePath(String templatePath) {
            this.configTemplatePath = templatePath
        }

        @Override
        String getConfigTemplatePlugin() {
            return configTemplatePlugin
        }

        @Override
        void setConfigTemplatePlugin(String plugin) {
            configTemplatePlugin = plugin
        }

        TableFilter(String templatePath, LayoutSize layoutSize, Map additionalFilter, TableFilterType filterType, String configTemplatePath = null, String templatePlugin = null, String configTemplatePlugin = null) {
            this.layoutSize = layoutSize
            this.templatePath = templatePath
            this.templatePlugin = templatePlugin
            this.additionalFilter = additionalFilter
            this.filterType = filterType
            this.configTemplatePath = configTemplatePath ?: templatePath
            this.configTemplatePlugin = configTemplatePath ? configTemplatePlugin : templatePlugin
        }
    }


    static enum TableField implements TableFieldEnum {
        CHECKBOX(true, "checkbox", false),

        NAME("name"),

        ID("id"),
        ACTIONS("actions", false),

        USERNAME("username"),
        EMAIL("email"),
        ENABLED("enabled"),

        private String fieldName
        private String labelName
        private boolean force
        private boolean orderable

        TableField(boolean force, String fieldName) {
            this.fieldName = fieldName
            this.labelName = fieldName
            this.force = force
            this.orderable = true
        }

        TableField(boolean force, String fieldName, boolean orderable) {
            this.fieldName = fieldName
            this.labelName = fieldName
            this.force = force
            this.orderable = orderable
        }

        TableField(String fieldName, boolean orderable) {
            this.fieldName = fieldName
            this.labelName = fieldName
            this.force = false
            this.orderable = orderable
        }

        TableField(String fieldName) {
            this.fieldName = fieldName
            this.labelName = fieldName
            this.force = false
            this.orderable = true
        }

        TableField(String fieldName, String labelName, boolean orderable) {
            this.fieldName = fieldName
            this.labelName = labelName
            this.force = false
            this.orderable = orderable
        }

        TableField(String fieldName, String labelName) {
            this.fieldName = fieldName
            this.labelName = labelName
            this.force = false
            this.orderable = true
        }

        @Override
        String getFieldName() {
            return fieldName
        }

        @Override
        String getLabelName() {
            return labelName
        }

        @Override
        boolean isForce() {
            return force
        }

        @Override
        boolean isOrderable() {
            return orderable
        }
    }

    static enum TableConfigData implements TableConfigDataEnum {

        EXAMPLE(//filters
                [TableFilter.SEARCH,
                 TableFilter.LIMIT],
                //defaultFilters
                [TableFilter.SEARCH,
                 TableFilter.LIMIT],
                //fields
                [TableField.NAME],
                //defaultFields
                [TableField.NAME]),

        USER(//filter
                [TableFilter.SEARCH,
                 TableFilter.ENABLED,
                 TableFilter.LIMIT,],
                //defaultfilter
                [TableFilter.SEARCH,
                 TableFilter.ENABLED,
                 TableFilter.LIMIT],
                //fields
                [TableField.USERNAME,
                 TableField.EMAIL,
                 TableField.NAME,
                 TableField.ENABLED],
                //defaultfields
                [TableField.USERNAME,
                 TableField.EMAIL,
                 TableField.NAME])

        LinkedHashSet<TableFilter> filters
        LinkedHashSet<TableFilter> defaultFilters
        LinkedHashSet<TableField> fields
        LinkedHashSet<TableField> defaultFields
        String rootMessageCode
        LinkedHashSet<LimitOptions> limitOptions

        TableConfigData(List<TableFilter> filters, List<TableFilter> defaultFilters, List<TableField> fields, List<TableField> defaultFields, List<LimitOptions> limitOptions = null) {
            this.fields = new LinkedHashSet<>()
            this.fields.addAll(fields)
            this.filters = new LinkedHashSet<>()
            this.filters.addAll(filters)
            this.defaultFilters = new LinkedHashSet<>()
            this.defaultFilters.addAll(defaultFilters)
            this.defaultFields = new LinkedHashSet<>()
            this.defaultFields.addAll(defaultFields)
            this.limitOptions = new LinkedHashSet<>()
            if (limitOptions != null) {
                this.limitOptions.addAll(limitOptions)
            } else {
                this.limitOptions.addAll([LimitOptions.LIMIT_10, LimitOptions.LIMIT_25, LimitOptions.LIMIT_50, LimitOptions.LIMIT_100])
            }
        }

        TableConfigData(String rootMessageCode, List<TableFilter> filters, List<TableFilter> defaultFilters, List<TableField> fields, List<TableField> defaultFields, List<LimitOptions> limitOptions = null) {
            this.rootMessageCode = rootMessageCode
            this.fields = new LinkedHashSet<>()
            this.fields.addAll(fields)
            this.filters = new LinkedHashSet<>()
            this.filters.addAll(filters)
            this.defaultFilters = new LinkedHashSet<>()
            this.defaultFilters.addAll(defaultFilters)
            this.defaultFields = new LinkedHashSet<>()
            this.defaultFields.addAll(defaultFields)
            this.limitOptions = new LinkedHashSet<>()
            if (limitOptions != null) {
                this.limitOptions.addAll(limitOptions)
            } else {
                this.limitOptions.addAll([LimitOptions.LIMIT_10, LimitOptions.LIMIT_25, LimitOptions.LIMIT_50, LimitOptions.LIMIT_100])
            }
        }
    }


}
