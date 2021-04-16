
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

    private final static QName _GetNumberResponse_QNAME = new QName("http://unique.com/", "getNumberResponse");
    private final static QName _GetMultiplication_QNAME = new QName("http://unique.com/", "getMultiplication");
    private final static QName _GetSubtraction_QNAME = new QName("http://unique.com/", "getSubtraction");
    private final static QName _GetDivisionResponse_QNAME = new QName("http://unique.com/", "getDivisionResponse");
    private final static QName _GetSubtractionResponse_QNAME = new QName("http://unique.com/", "getSubtractionResponse");
    private final static QName _GetNumber_QNAME = new QName("http://unique.com/", "getNumber");
    private final static QName _GetMultiplicationResponse_QNAME = new QName("http://unique.com/", "getMultiplicationResponse");
    private final static QName _GetDivision_QNAME = new QName("http://unique.com/", "getDivision");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unique
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNumber }
     * 
     */
    public GetNumber createGetNumber() {
        return new GetNumber();
    }

    /**
     * Create an instance of {@link GetDivisionResponse }
     * 
     */
    public GetDivisionResponse createGetDivisionResponse() {
        return new GetDivisionResponse();
    }

    /**
     * Create an instance of {@link GetSubtractionResponse }
     * 
     */
    public GetSubtractionResponse createGetSubtractionResponse() {
        return new GetSubtractionResponse();
    }

    /**
     * Create an instance of {@link GetDivision }
     * 
     */
    public GetDivision createGetDivision() {
        return new GetDivision();
    }

    /**
     * Create an instance of {@link GetMultiplicationResponse }
     * 
     */
    public GetMultiplicationResponse createGetMultiplicationResponse() {
        return new GetMultiplicationResponse();
    }

    /**
     * Create an instance of {@link GetMultiplication }
     * 
     */
    public GetMultiplication createGetMultiplication() {
        return new GetMultiplication();
    }

    /**
     * Create an instance of {@link GetNumberResponse }
     * 
     */
    public GetNumberResponse createGetNumberResponse() {
        return new GetNumberResponse();
    }

    /**
     * Create an instance of {@link GetSubtraction }
     * 
     */
    public GetSubtraction createGetSubtraction() {
        return new GetSubtraction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getNumberResponse")
    public JAXBElement<GetNumberResponse> createGetNumberResponse(GetNumberResponse value) {
        return new JAXBElement<GetNumberResponse>(_GetNumberResponse_QNAME, GetNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getMultiplication")
    public JAXBElement<GetMultiplication> createGetMultiplication(GetMultiplication value) {
        return new JAXBElement<GetMultiplication>(_GetMultiplication_QNAME, GetMultiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubtraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getSubtraction")
    public JAXBElement<GetSubtraction> createGetSubtraction(GetSubtraction value) {
        return new JAXBElement<GetSubtraction>(_GetSubtraction_QNAME, GetSubtraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getDivisionResponse")
    public JAXBElement<GetDivisionResponse> createGetDivisionResponse(GetDivisionResponse value) {
        return new JAXBElement<GetDivisionResponse>(_GetDivisionResponse_QNAME, GetDivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubtractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getSubtractionResponse")
    public JAXBElement<GetSubtractionResponse> createGetSubtractionResponse(GetSubtractionResponse value) {
        return new JAXBElement<GetSubtractionResponse>(_GetSubtractionResponse_QNAME, GetSubtractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getNumber")
    public JAXBElement<GetNumber> createGetNumber(GetNumber value) {
        return new JAXBElement<GetNumber>(_GetNumber_QNAME, GetNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getMultiplicationResponse")
    public JAXBElement<GetMultiplicationResponse> createGetMultiplicationResponse(GetMultiplicationResponse value) {
        return new JAXBElement<GetMultiplicationResponse>(_GetMultiplicationResponse_QNAME, GetMultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "getDivision")
    public JAXBElement<GetDivision> createGetDivision(GetDivision value) {
        return new JAXBElement<GetDivision>(_GetDivision_QNAME, GetDivision.class, null, value);
    }

}
