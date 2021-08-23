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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.TDigestPercentilesAggregate
@JsonpDeserializable
public class TDigestPercentilesAggregate extends PercentilesAggregateBase implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private TDigestPercentilesAggregate(Builder builder) {
		super(builder);

	}

	public static TDigestPercentilesAggregate of(Function<Builder, ObjectBuilder<TDigestPercentilesAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "tdigest_percentiles";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TDigestPercentilesAggregate}.
	 */
	public static class Builder extends PercentilesAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TDigestPercentilesAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TDigestPercentilesAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TDigestPercentilesAggregate build() {
			_checkSingleUse();

			return new TDigestPercentilesAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TDigestPercentilesAggregate}
	 */
	public static final JsonpDeserializer<TDigestPercentilesAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, TDigestPercentilesAggregate::setupTDigestPercentilesAggregateDeserializer, Builder::build);

	protected static void setupTDigestPercentilesAggregateDeserializer(
			DelegatingDeserializer<TDigestPercentilesAggregate.Builder> op) {
		setupPercentilesAggregateBaseDeserializer(op);

	}

}