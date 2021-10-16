/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.core.update_by_query_rethrottle;

import org.opensearch.client.opensearch._types.BaseNode;
import org.opensearch.client.opensearch.tasks.Info;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.MapBuilder;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

// typedef: _global.update_by_query_rethrottle.UpdateByQueryRethrottleNode
@JsonpDeserializable
public class UpdateByQueryRethrottleNode extends BaseNode {
	private final Map<String, Info> tasks;

	// ---------------------------------------------------------------------------------------------

	private UpdateByQueryRethrottleNode(Builder builder) {
		super(builder);

		this.tasks = ModelTypeHelper.unmodifiableRequired(builder.tasks, this, "tasks");

	}

	public static UpdateByQueryRethrottleNode of(Function<Builder, ObjectBuilder<UpdateByQueryRethrottleNode>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code tasks}
	 */
	public final Map<String, Info> tasks() {
		return this.tasks;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.tasks)) {
			generator.writeKey("tasks");
			generator.writeStartObject();
			for (Map.Entry<String, Info> item0 : this.tasks.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRethrottleNode}.
	 */
	public static class Builder extends BaseNode.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateByQueryRethrottleNode> {
		private Map<String, Info> tasks;

		/**
		 * Required - API name: {@code tasks}
		 */
		public final Builder tasks(Map<String, Info> value) {
			this.tasks = value;
			return this;
		}

		/**
		 * Set {@link #tasks(Map)} to a singleton map.
		 */
		public Builder tasks(String key, Function<Info.Builder, ObjectBuilder<Info>> fn) {
			return this.tasks(Collections.singletonMap(key, fn.apply(new Info.Builder()).build()));
		}

		public final Builder tasks(
				Function<MapBuilder<String, Info, Info.Builder>, ObjectBuilder<Map<String, Info>>> fn) {
			return tasks(fn.apply(new MapBuilder<>(Info.Builder::new)).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateByQueryRethrottleNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryRethrottleNode build() {
			_checkSingleUse();

			return new UpdateByQueryRethrottleNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateByQueryRethrottleNode}
	 */
	public static final JsonpDeserializer<UpdateByQueryRethrottleNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, UpdateByQueryRethrottleNode::setupUpdateByQueryRethrottleNodeDeserializer, Builder::build);

	protected static void setupUpdateByQueryRethrottleNodeDeserializer(
			DelegatingDeserializer<UpdateByQueryRethrottleNode.Builder> op) {
		BaseNode.setupBaseNodeDeserializer(op);
		op.add(Builder::tasks, JsonpDeserializer.stringMapDeserializer(Info._DESERIALIZER), "tasks");

	}

}