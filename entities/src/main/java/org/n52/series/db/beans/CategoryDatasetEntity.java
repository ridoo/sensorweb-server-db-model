/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
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
 */
package org.n52.series.db.beans;

import java.util.HashSet;
import java.util.Set;

import org.n52.series.db.beans.dataset.CategoryDataset;

public class CategoryDatasetEntity extends DatasetEntity implements CategoryDataset<CategoryDatasetEntity> {

    private static final long serialVersionUID = -3225007112833816443L;

    private static final String DATASET_TYPE = "category";

    private Set<CategoryDatasetEntity> referenceValues = new HashSet<>();

    public CategoryDatasetEntity() {
        super(DATASET_TYPE);
    }

    @Override
    public Set<CategoryDatasetEntity> getReferenceValues() {
        return referenceValues;
    }

    @Override
    public CategoryDatasetEntity setReferenceValues(Set<CategoryDatasetEntity> referenceValues) {
        this.referenceValues = referenceValues;
        return this;
    }

}
