package mego.mgym.org;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-06-08T20:03:43.362+06:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "CgUnitService", 
                  wsdlLocation = "file:/D:/asraf.sohel/download/wsdl.xml",
                  targetNamespace = "http://org.mGym.mego/") 
public class CgUnitService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://org.mGym.mego/", "CgUnitService");
    public final static QName CgUnitServiceSoap = new QName("http://org.mGym.mego/", "CgUnitServiceSoap");
    public final static QName CgUnitServiceSoap12 = new QName("http://org.mGym.mego/", "CgUnitServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/asraf.sohel/download/wsdl.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CgUnitService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/asraf.sohel/download/wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public CgUnitService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CgUnitService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CgUnitService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CgUnitServiceSoap
     */
    @WebEndpoint(name = "CgUnitServiceSoap")
    public CgUnitServiceSoap getCgUnitServiceSoap() {
        return super.getPort(CgUnitServiceSoap, CgUnitServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CgUnitServiceSoap
     */
    @WebEndpoint(name = "CgUnitServiceSoap")
    public CgUnitServiceSoap getCgUnitServiceSoap(WebServiceFeature... features) {
        return super.getPort(CgUnitServiceSoap, CgUnitServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CgUnitServiceSoap
     */
    @WebEndpoint(name = "CgUnitServiceSoap12")
    public CgUnitServiceSoap getCgUnitServiceSoap12() {
        return super.getPort(CgUnitServiceSoap12, CgUnitServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CgUnitServiceSoap
     */
    @WebEndpoint(name = "CgUnitServiceSoap12")
    public CgUnitServiceSoap getCgUnitServiceSoap12(WebServiceFeature... features) {
        return super.getPort(CgUnitServiceSoap12, CgUnitServiceSoap.class, features);
    }

}