/*
 * Copyright RestClientGenerator
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.github.raphasil.generator.client.rest.api.http;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Replaces the header with the value of its target.
 *
 * <pre><code>
 * &#64;POST("/")
 * Object foo(@Header("x-api-key") String key);
 * </code></pre>
 *
 * @author Raphael Nascimento (@raphasil)
 * @see Headers
 */
@Documented
@Target({ ElementType.PARAMETER })
@Retention(RetentionPolicy.SOURCE)
public @interface Header {
	String value();
}
