
package awsClient2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AWSECommerceServicePortType", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AWSECommerceServicePortType {


    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.ItemSearchResponse
     */
    @WebMethod(operationName = "ItemSearch", action = "http://soap.amazon.com/ItemSearch")
    @WebResult(name = "ItemSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public ItemSearchResponse itemSearch(
        @WebParam(name = "ItemSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        ItemSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.ItemLookupResponse
     */
    @WebMethod(operationName = "ItemLookup", action = "http://soap.amazon.com/ItemLookup")
    @WebResult(name = "ItemLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public ItemLookupResponse itemLookup(
        @WebParam(name = "ItemLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        ItemLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.BrowseNodeLookupResponse
     */
    @WebMethod(operationName = "BrowseNodeLookup", action = "http://soap.amazon.com/BrowseNodeLookup")
    @WebResult(name = "BrowseNodeLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public BrowseNodeLookupResponse browseNodeLookup(
        @WebParam(name = "BrowseNodeLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        BrowseNodeLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.SimilarityLookupResponse
     */
    @WebMethod(operationName = "SimilarityLookup", action = "http://soap.amazon.com/SimilarityLookup")
    @WebResult(name = "SimilarityLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public SimilarityLookupResponse similarityLookup(
        @WebParam(name = "SimilarityLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        SimilarityLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.CartGetResponse
     */
    @WebMethod(operationName = "CartGet", action = "http://soap.amazon.com/CartGet")
    @WebResult(name = "CartGetResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public CartGetResponse cartGet(
        @WebParam(name = "CartGet", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        CartGet body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.CartCreateResponse
     */
    @WebMethod(operationName = "CartCreate", action = "http://soap.amazon.com/CartCreate")
    @WebResult(name = "CartCreateResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public CartCreateResponse cartCreate(
        @WebParam(name = "CartCreate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        CartCreate body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.CartAddResponse
     */
    @WebMethod(operationName = "CartAdd", action = "http://soap.amazon.com/CartAdd")
    @WebResult(name = "CartAddResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public CartAddResponse cartAdd(
        @WebParam(name = "CartAdd", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        CartAdd body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.CartModifyResponse
     */
    @WebMethod(operationName = "CartModify", action = "http://soap.amazon.com/CartModify")
    @WebResult(name = "CartModifyResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public CartModifyResponse cartModify(
        @WebParam(name = "CartModify", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        CartModify body);

    /**
     * 
     * @param body
     * @return
     *     returns awsClient2.CartClearResponse
     */
    @WebMethod(operationName = "CartClear", action = "http://soap.amazon.com/CartClear")
    @WebResult(name = "CartClearResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
    public CartClearResponse cartClear(
        @WebParam(name = "CartClear", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", partName = "body")
        CartClear body);

}
