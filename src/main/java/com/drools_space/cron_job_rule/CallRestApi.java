package com.drools_space.cron_job_rule;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CallRestApi implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;

	public CallRestApi() {
	}

	public static String getMethod() {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://gorest.co.in/public/v2/todos"))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request,
					HttpResponse.BodyHandlers.ofString());
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return null;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public CallRestApi(java.lang.String id) {
		this.id = id;
	}

}