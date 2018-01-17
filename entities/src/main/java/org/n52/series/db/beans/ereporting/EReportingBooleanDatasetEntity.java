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

package org.n52.series.db.beans.ereporting;

import java.util.HashSet;
import java.util.Set;

import org.n52.series.db.beans.dataset.BooleanDataset;

public class EReportingBooleanDatasetEntity extends EReportingDatasetEntity
        implements BooleanDataset<EReportingBooleanDatasetEntity> {

    private static final long serialVersionUID = 5026545130550522586L;

    private Set<EReportingBooleanDatasetEntity> referenceValues = new HashSet<>();

    @Override
    public Set<EReportingBooleanDatasetEntity> getReferenceValues() {
        return referenceValues;
    }

    @Override
    public EReportingBooleanDatasetEntity setReferenceValues(Set<EReportingBooleanDatasetEntity> referenceValues) {
        this.referenceValues = referenceValues;
        return this;
    }

}
