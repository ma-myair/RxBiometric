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

package cz.myair.rxbiometric.data;


/**
 * Result of a decryption operation with biometric authentication.
 */
public class BiometricDecryptionResult extends BiometricAuthenticationResult {

    private final char[] decrypted;

    /**
     * Default constructor
     *  @param result    result of the biometric authentication
     * @param decrypted decrypted data
     */
    public BiometricDecryptionResult(BiometricResult result, char[] decrypted) {
        super(result);
        this.decrypted = decrypted;
    }

    /**
     * @return decrypted data as a String. Can only be accessed if the result of the biometric
     * authentication was of type {@link BiometricResult#AUTHENTICATED}.
     */
    public String getDecrypted() {
        return new String(getDecryptedChars());
    }

    /**
     * @return decrypted data as a char[]. Can only be accessed if the result of the biometric
     * authentication was of type {@link BiometricResult#AUTHENTICATED}.
     */
    public char[] getDecryptedChars() {
        if (!isSuccess()) {
            throw new IllegalAccessError("Biometric authentication was not successful, cannot access decryption result");
        }
        return decrypted;
    }
}