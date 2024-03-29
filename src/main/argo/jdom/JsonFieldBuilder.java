/*
 * Copyright 2010 Mark Slater
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package argo.jdom;

final class JsonFieldBuilder {

    private JsonNodeBuilder<JsonStringNode> keyBuilder;
    private JsonNodeBuilder valueBuilder;


    private JsonFieldBuilder() { }

    static JsonFieldBuilder aJsonFieldBuilder() {
        return new JsonFieldBuilder();
    }

    JsonFieldBuilder withKey(final JsonNodeBuilder<JsonStringNode> jsonStringNodeBuilder) {
        keyBuilder = jsonStringNodeBuilder;
        return this;
    }

    JsonFieldBuilder withValue(final JsonNodeBuilder jsonNodeBuilder){
        valueBuilder = jsonNodeBuilder;
        return this;
    }

    JsonStringNode buildKey() {
        return keyBuilder.build();
    }

    JsonNode buildValue() {
        return valueBuilder.build();
    }
}
