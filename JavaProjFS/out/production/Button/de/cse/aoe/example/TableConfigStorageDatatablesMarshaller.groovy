package de.cse.aoe.example

import de.cse.aoe.AbstractTableConfigStorageDatatablesMarshaller
import de.cse.aoe.example.TableConfigStorageField
import de.cse.aoe.example.TableConfigStorageService
import grails.util.Holders

abstract class TableConfigStorageDatatablesMarshaller<T> extends AbstractTableConfigStorageDatatablesMarshaller<T, TableConfigStorageField> {

  private TableConfigStorageService tableConfigStorageService

  TableConfigStorageDatatablesMarshaller(String storageName, String customFieldValuesProperty, Map params) {
    super(storageName, customFieldValuesProperty, params)
  }


  @Override
  TableConfigStorageService getTableConfigStorageService() {
    if (!tableConfigStorageService) {
      tableConfigStorageService = Holders.grailsApplication.mainContext.getBean("tableConfigStorageService")
    }
    return tableConfigStorageService
  }

  @Override
  protected String marshallCustomFieldValue(def customFieldValue, def customField) {
    return null
  }

}
