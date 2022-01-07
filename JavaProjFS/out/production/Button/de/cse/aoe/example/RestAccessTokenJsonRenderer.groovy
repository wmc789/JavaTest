package de.cse.aoe.example

import de.cse.aoe.rest.AbstractRestAccessTokenJsonRenderer
import grails.plugin.springsecurity.rest.token.AccessToken

class RestAccessTokenJsonRenderer extends AbstractRestAccessTokenJsonRenderer<LoginToken> {

    @Override
    protected Class<LoginToken> getTokenDomainClass() {
        return LoginToken.class
    }

    @Override
    String generateJson(AccessToken accessToken) {
        String result = null
        LoginToken.withTransaction {
            result = super.generateJson(accessToken)

        }
        return result
    }
}
