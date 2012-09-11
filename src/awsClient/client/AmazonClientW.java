package awsClient.client;

import java.util.List;

import javax.xml.ws.Holder;

import awsClient.AWSECommerceService;
import awsClient.AWSECommerceServicePortType;
import awsClient.Item;
import awsClient.ItemSearch;
import awsClient.ItemSearchRequest;
import awsClient.Items;
import awsClient.OperationRequest;

public class AmazonClientW {
	public static void main(String[] args) {
		// if (args.length < 1) {
		// System.err.println("Usage: java AmazonClientW <access key>");
		// return;
		// }
		//
		// final String access_key = args[0];

		// Construct a service object to get the port object.
		AWSECommerceService service = new AWSECommerceService();
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		// Construct an empty request object and then add details.
		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("quantum gravity");

		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId("jubre-20");

		Holder<OperationRequest> operation_request = null;
		Holder<List<Items>> items = new Holder<List<Items>>();

		port.itemSearch(search.getMarketplaceDomain(),
				search.getAWSAccessKeyId(), search.getAssociateTag(),
				search.getXMLEscaping(), search.getValidate(),
				search.getShared(), search.getRequest(), operation_request,
				items);

		// Unpack the response to print the book titles.
		Items retval = items.value.get(0); // first and only Items element
		List<Item> item_list = retval.getItem(); // list of Item subelements
		for (Item item : item_list)
			// each Item in the list
			System.out.println(item.getItemAttributes().getTitle());
	}
}
