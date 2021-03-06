/*
 * Copyright 2012-2019 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.couchbase.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Couchbase specific {@link org.springframework.data.repository.Repository} interface that is
 * a {@link PagingAndSortingRepository}.
 *
 * @author Simon Baslé
 */
public interface CouchbasePagingAndSortingRepository<T, ID extends Serializable>
    extends CouchbaseRepository<T, ID>, PagingAndSortingRepository<T, ID> {
}
