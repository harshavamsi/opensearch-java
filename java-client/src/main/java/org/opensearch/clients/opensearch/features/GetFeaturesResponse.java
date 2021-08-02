/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.features;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: features.get_features.Response
public final class GetFeaturesResponse implements ToJsonp {
	private final Number stub;

	// ---------------------------------------------------------------------------------------------

	protected GetFeaturesResponse(Builder builder) {

		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * API name: {@code stub}
	 */
	public Number stub() {
		return this.stub;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("stub");
		generator.write(this.stub.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFeaturesResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetFeaturesResponse> {
		private Number stub;

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(Number value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link GetFeaturesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFeaturesResponse build() {

			return new GetFeaturesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetFeaturesResponse
	 */
	public static final JsonpDeserializer<GetFeaturesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetFeaturesResponse::setupGetFeaturesResponseDeserializer);

	protected static void setupGetFeaturesResponseDeserializer(DelegatingDeserializer<GetFeaturesResponse.Builder> op) {

		op.add(Builder::stub, JsonpDeserializer.numberDeserializer(), "stub");

	}

}