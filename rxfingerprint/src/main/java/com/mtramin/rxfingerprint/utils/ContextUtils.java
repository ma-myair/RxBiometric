/*
 * Copyright 2015 Marvin Ramin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mtramin.rxfingerprint.utils;

import android.content.Context;

/**
 * Utility methods for {@link Context}s
 */
public class ContextUtils {

    /**
     * Returns the package name of the current application using this library
     *
     * @param context current context
     * @return Package name of the application
     */
    public static String getPackageName(Context context) {
        return context.getPackageName();
    }
}