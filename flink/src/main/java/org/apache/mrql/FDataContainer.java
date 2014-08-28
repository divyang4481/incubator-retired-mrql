/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mrql;

import java.io.IOException;
import org.apache.flink.core.memory.DataInputView;
import org.apache.flink.core.memory.DataOutputView;
import org.apache.flink.core.io.IOReadableWritable;

final public class FDataContainer extends MRContainer implements IOReadableWritable, Comparable<MRContainer> {

    FDataContainer ( MRData d ) { super(d); }

    @Override
    public void read ( DataInputView in ) throws IOException {
        data = super.read(in);
    }

    @Override
    public void write ( DataOutputView out ) throws IOException {
        super.write(out);
    }
}