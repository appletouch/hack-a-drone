/*
 * Copyright (C) 2017 Ordina
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

package nl.ordina.jtech.hackadrone.utils;

/**
 * Class representing OS utils.
 */
public final class OS {

    /**
     * Gets the used OS.
     *
     * @return the used os
     */
    public static String getOS() {
        String OS = System.getProperty("os.name").toLowerCase();

        if (OS.contains("win")) {
            OS = "win";
        } else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")) {
            OS = "unix";
        } else if (OS.contains("osx") || OS.contains("mac")) {
            OS = "osx";
        }

        return OS;
    }

}
