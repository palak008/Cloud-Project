
package com.unique;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unique package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProfitLoss_QNAME = new QName("http://unique.com/", "ProfitLoss");
    private final static QName _ProfitLossResponse_QNAME = new QName("http://unique.com/", "ProfitLossResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unique
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProfitLoss }
     * 
     */
    public ProfitLoss createProfitLoss() {
        return new ProfitLoss();
    }

    /**
     * Create an instance of {@link ProfitLossResponse }
     * 
     */
    public ProfitLossResponse createProfitLossResponse() {
        return new ProfitLossResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfitLoss }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "ProfitLoss")
    public JAXBElement<ProfitLoss> createProfitLoss(ProfitLoss value) {
        return new JAXBElement<ProfitLoss>(_ProfitLoss_QNAME, ProfitLoss.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfitLossResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "ProfitLossResponse")
    public JAXBElement<ProfitLossResponse> createProfitLossResponse(ProfitLossResponse value) {
        return new JAXBElement<ProfitLossResponse>(_ProfitLossResponse_QNAME, ProfitLossResponse.class, null, value);
    }

}
