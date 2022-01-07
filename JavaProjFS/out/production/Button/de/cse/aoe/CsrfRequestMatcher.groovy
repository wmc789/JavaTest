package de.cse.aoe

import org.springframework.security.web.util.matcher.RequestMatcher

import javax.servlet.http.HttpServletRequest
import java.util.regex.Pattern

class CsrfRequestMatcher  implements RequestMatcher {

    // Always allow the HTTP GET method
    private Pattern allowedMethods = Pattern.compile("^(GET|TRACE|HEAD|OPTIONS)\$")

    @SuppressWarnings("GrUnnecessaryPublicModifier")
    @Override
    public boolean matches(HttpServletRequest request) {

        if (allowedMethods.matcher(request.getMethod()).matches()) {
            return false
        }

        if ( request.forwardURI ) {
            if ( request.forwardURI.contains("login/authenticate") ) {
                return false
            }
            else if ( request.forwardURI.contains("restApi")
                    || request.forwardURI.contains("webApi")
                    || request.forwardURI.contains("misApi")
                    || request.forwardURI.contains("documentApi")
                    || request.forwardURI.contains("protocolApi")
                    || request.forwardURI.contains("serverApi")
                    || request.forwardURI.contains("masterApi")
                    || request.forwardURI.contains("api/versions")
                    || request.forwardURI.contains("device/requestUniqueDeviceId")
                    || request.forwardURI.contains("systemhausOne/createTicket")
                    || request.forwardURI.contains("systemhausOne/closeTicket")
                    || request.forwardURI.contains("externalEvent/trigger")
                    || request.forwardURI.contains("stomp/")
            ) {
                return false
            }
        }

        return true
    }

}

