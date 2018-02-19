
package com.frenzi.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.frenzi.webservice package. 
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

    private final static QName _GetFilesNameResponse_QNAME = new QName("http://webservice.frenzi.com/", "getFilesNameResponse");
    private final static QName _GetFile_QNAME = new QName("http://webservice.frenzi.com/", "getFile");
    private final static QName _GetFilesName_QNAME = new QName("http://webservice.frenzi.com/", "getFilesName");
    private final static QName _GetFileResponse_QNAME = new QName("http://webservice.frenzi.com/", "getFileResponse");
    private final static QName _GetFileResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.frenzi.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFileResponse }
     * 
     */
    public GetFileResponse createGetFileResponse() {
        return new GetFileResponse();
    }

    /**
     * Create an instance of {@link GetFile }
     * 
     */
    public GetFile createGetFile() {
        return new GetFile();
    }

    /**
     * Create an instance of {@link GetFilesName }
     * 
     */
    public GetFilesName createGetFilesName() {
        return new GetFilesName();
    }

    /**
     * Create an instance of {@link GetFilesNameResponse }
     * 
     */
    public GetFilesNameResponse createGetFilesNameResponse() {
        return new GetFilesNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.frenzi.com/", name = "getFilesNameResponse")
    public JAXBElement<GetFilesNameResponse> createGetFilesNameResponse(GetFilesNameResponse value) {
        return new JAXBElement<GetFilesNameResponse>(_GetFilesNameResponse_QNAME, GetFilesNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.frenzi.com/", name = "getFile")
    public JAXBElement<GetFile> createGetFile(GetFile value) {
        return new JAXBElement<GetFile>(_GetFile_QNAME, GetFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.frenzi.com/", name = "getFilesName")
    public JAXBElement<GetFilesName> createGetFilesName(GetFilesName value) {
        return new JAXBElement<GetFilesName>(_GetFilesName_QNAME, GetFilesName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.frenzi.com/", name = "getFileResponse")
    public JAXBElement<GetFileResponse> createGetFileResponse(GetFileResponse value) {
        return new JAXBElement<GetFileResponse>(_GetFileResponse_QNAME, GetFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetFileResponse.class)
    public JAXBElement<byte[]> createGetFileResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileResponseReturn_QNAME, byte[].class, GetFileResponse.class, ((byte[]) value));
    }

}
