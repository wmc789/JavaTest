package de.cse.aoe

import org.springframework.security.web.util.matcher.RequestMatcher

import javax.servlet.http.HttpServletRequest

class CsrfIgnoreRequestMatcher implements RequestMatcher {

    @SuppressWarnings("GrUnnecessaryPublicModifier")
    @Override
    public boolean matches(HttpServletRequest request) {

        if ( request.forwardURI ) {
            if ( request.forwardURI.contains("restApi")
                    || request.forwardURI.contains("webApi")
                    || request.forwardURI.contains("misApi")
                    || request.forwardURI.contains("documentApi")
                    || request.forwardURI.contains("protocolApi")
                    || request.forwardURI.contains("serverApi")
                    || request.forwardURI.contains("masterApi")
                    || request.forwardURI.contains("api/versions")
                    || request.forwardURI.contains("device/requestUniqueDeviceId")
            ) {
                return false
            }
        }

        return true
    }

}

