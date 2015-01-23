
package client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

@Generated(value = {
    "wadl|http://localhost:8080/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2015-01-24T02:11:26.880+09:00")
public class Localhost {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://localhost:8080/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = Localhost.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static Localhost.Add add(Client client, URI baseURI) {
        return new Localhost.Add(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(Configurable cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static Client createClientInstance() {
        return ClientBuilder.newClient();
    }

    /**
     * Create a new Client instance
     * 
     */
    public static Client createClient() {
        Client client = createClientInstance();
        customizeClientConfiguration(client);
        return client;
    }

    public static Localhost.Add add() {
        return add(createClient(), BASE_URI);
    }

    public static Localhost.Add add(Client client) {
        return add(client, BASE_URI);
    }

    public static class Add {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Add(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Add(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("add");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public Localhost.Add.Json json() {
            return new Localhost.Add.Json(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost.Add.Xml xml() {
            return new Localhost.Add.Xml(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Json {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Json(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Json(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("json");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public Result getAsResult() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(Result.class);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Result getAsResult(Integer arg1, Integer arg2) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(Result.class);
            }

            public<T >T getAsJson(Integer arg1, Integer arg2, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Integer arg1, Integer arg2, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Xml {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Xml(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Xml(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("xml");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public Result getAsResult() {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(Result.class);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public Result getAsResult(Integer arg1, Integer arg2) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(Result.class);
            }

            public<T >T getAsXml(Integer arg1, Integer arg2, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Integer arg1, Integer arg2, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (arg1 == null) {
                }
                if (arg1 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", arg1);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg1", ((Object[]) null));
                }
                if (arg2 == null) {
                }
                if (arg2 != null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", arg2);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("arg2", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
