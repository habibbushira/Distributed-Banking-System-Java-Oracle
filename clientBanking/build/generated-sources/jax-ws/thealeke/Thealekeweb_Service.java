
package thealeke;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "thealekeweb", targetNamespace = "http://thealeke/", wsdlLocation = "http://localhost:8080/thealekeweb/thealekeweb?wsdl")
public class Thealekeweb_Service
    extends Service
{

    private final static URL THEALEKEWEB_WSDL_LOCATION;
    private final static WebServiceException THEALEKEWEB_EXCEPTION;
    private final static QName THEALEKEWEB_QNAME = new QName("http://thealeke/", "thealekeweb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/thealekeweb/thealekeweb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        THEALEKEWEB_WSDL_LOCATION = url;
        THEALEKEWEB_EXCEPTION = e;
    }

    public Thealekeweb_Service() {
        super(__getWsdlLocation(), THEALEKEWEB_QNAME);
    }

    public Thealekeweb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), THEALEKEWEB_QNAME, features);
    }

    public Thealekeweb_Service(URL wsdlLocation) {
        super(wsdlLocation, THEALEKEWEB_QNAME);
    }

    public Thealekeweb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, THEALEKEWEB_QNAME, features);
    }

    public Thealekeweb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Thealekeweb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Thealekeweb
     */
    @WebEndpoint(name = "thealekewebPort")
    public Thealekeweb getThealekewebPort() {
        return super.getPort(new QName("http://thealeke/", "thealekewebPort"), Thealekeweb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Thealekeweb
     */
    @WebEndpoint(name = "thealekewebPort")
    public Thealekeweb getThealekewebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://thealeke/", "thealekewebPort"), Thealekeweb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (THEALEKEWEB_EXCEPTION!= null) {
            throw THEALEKEWEB_EXCEPTION;
        }
        return THEALEKEWEB_WSDL_LOCATION;
    }

}