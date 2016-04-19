/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ridesafe.android.models

/**
 * Created by evoxmusic on 10/04/16.
 *
 * Acceleration data x2 + y2 + z2
 */
data class Acceleration(val timestamp: Long,
                        val x: Float,
                        val y: Float,
                        val z: Float) {

    fun toArray() = arrayOf<Number>(timestamp, x, y, z)

    companion object {
        fun factory(array: Array<Number>) = Acceleration(
                timestamp = array[0].toLong(),
                x = array[1].toFloat(),
                y = array[2].toFloat(),
                z = array[3].toFloat()
        )
    }

}