
package trng.soapWS.temp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.soapWS.temp1 package. 
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

    private final static QName _GetCustomerResponse_QNAME = new QName("http://www.example.org/CustomerOperations", "GetCustomerResponse");
    private final static QName _GetCustomerRequest_QNAME = new QName("http://www.example.org/CustomerOperations", "GetCustomerRequest");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://www.example.org/CustomerOperations", "AddCustomerResponse");
    private final static QName _UpdateCustomerRequest_QNAME = new QName("http://www.example.org/CustomerOperations", "UpdateCustomerRequest");
    private final static QName _Customer_QNAME = new QName("http://www.example.org/Customer", "Customer");
    private final static QName _DeleteCustomerRequest_QNAME = new QName("http://www.example.org/CustomerOperations", "DeleteCustomerRequest");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://www.example.org/CustomerOperations", "DeleteCustomerResponse");
    private final static QName _AddCustomerRequest_QNAME = new QName("http://www.example.org/CustomerOperations", "AddCustomerRequest");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://www.example.org/CustomerOperations", "UpdateCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.soapWS.temp1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewOperationResponse2 }
     * 
     */
    public NewOperationResponse2 createNewOperationResponse2() {
        return new NewOperationResponse2();
    }

    /**
     * Create an instance of {@link NewOperationResponse3 }
     * 
     */
    public NewOperationResponse3 createNewOperationResponse3() {
        return new NewOperationResponse3();
    }

    /**
     * Create an instance of {@link NewOperationResponse1 }
     * 
     */
    public NewOperationResponse1 createNewOperationResponse1() {
        return new NewOperationResponse1();
    }

    /**
     * Create an instance of {@link NewOperationResponse }
     * 
     */
    public NewOperationResponse createNewOperationResponse() {
        return new NewOperationResponse();
    }

    /**
     * Create an instance of {@link NewOperationResponse4 }
     * 
     */
    public NewOperationResponse4 createNewOperationResponse4() {
        return new NewOperationResponse4();
    }

    /**
     * Create an instance of {@link NewOperation }
     * 
     */
    public NewOperation createNewOperation() {
        return new NewOperation();
    }

    /**
     * Create an instance of {@link AddCustomerRequest }
     * 
     */
    public AddCustomerRequest createAddCustomerRequest() {
        return new AddCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerRequest }
     * 
     */
    public GetCustomerRequest createGetCustomerRequest() {
        return new GetCustomerRequest();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "GetCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "GetCustomerRequest")
    public JAXBElement<GetCustomerRequest> createGetCustomerRequest(GetCustomerRequest value) {
        return new JAXBElement<GetCustomerRequest>(_GetCustomerRequest_QNAME, GetCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "AddCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "UpdateCustomerRequest")
    public JAXBElement<UpdateCustomerRequest> createUpdateCustomerRequest(UpdateCustomerRequest value) {
        return new JAXBElement<UpdateCustomerRequest>(_UpdateCustomerRequest_QNAME, UpdateCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Customer", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "DeleteCustomerRequest")
    public JAXBElement<DeleteCustomerRequest> createDeleteCustomerRequest(DeleteCustomerRequest value) {
        return new JAXBElement<DeleteCustomerRequest>(_DeleteCustomerRequest_QNAME, DeleteCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "DeleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "AddCustomerRequest")
    public JAXBElement<AddCustomerRequest> createAddCustomerRequest(AddCustomerRequest value) {
        return new JAXBElement<AddCustomerRequest>(_AddCustomerRequest_QNAME, AddCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/CustomerOperations", name = "UpdateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

}
