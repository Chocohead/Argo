/*
 * Copyright 2010 Mark Slater
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package argo.staj;

final class ElementWithoutText implements Element {

    private final JsonStreamElementType jsonStreamElementType;

    ElementWithoutText(final JsonStreamElementType jsonStreamElementType) {
        this.jsonStreamElementType = jsonStreamElementType;
    }

    public JsonStreamElementType getJsonStreamElementType() {
        return jsonStreamElementType;
    }

    public boolean hasText() {
        return false;
    }

    public String getText() {
        throw new IllegalStateException("Attempt to get text from an Element of type [" + jsonStreamElementType + "] that doesn't have text.");
    }
}
