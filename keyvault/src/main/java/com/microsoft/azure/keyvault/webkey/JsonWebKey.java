/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.microsoft.azure.keyvault.webkey;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonAutoDetect(value = { JsonMethod.GETTER, JsonMethod.SETTER }, getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY)
public class JsonWebKey {

    private String kid;

    @JsonProperty("kid")
    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    private String kty;

    @JsonProperty("kty")
    public String getKty() {
        return kty;
    }

    public void setKty(String kty) {
        this.kty = kty;
    }

    private List<String> keyOps;

    @JsonProperty("key_ops")
    public List<String> getKeyOps() {
        return keyOps;
    }

    public void setKeyOps(List<String> keyOps) {
        this.keyOps = keyOps;
    }

    private byte[] n;

    @JsonProperty("n")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getN() {
        return n;
    }

    public void setN(byte[] n) {
        this.n = n;
    }

    private byte[] e;

    @JsonProperty("e")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getE() {
        return e;
    }

    public void setE(byte[] e) {
        this.e = e;
    }

    private byte[] d;

    @JsonProperty("d")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getD() {
        return d;
    }

    public void setD(byte[] d) {
        this.d = d;
    }

    private byte[] dp;

    @JsonProperty("dp")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getDP() {
        return dp;
    }

    public void setDP(byte[] dp) {
        this.dp = dp;
    }

    private byte[] dq;

    @JsonProperty("dq")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getDQ() {
        return dq;
    }

    public void setDQ(byte[] dq) {
        this.dq = dq;
    }

    private byte[] qi;

    @JsonProperty("qi")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getQI() {
        return qi;
    }

    public void setQI(byte[] qi) {
        this.qi = qi;
    }

    private byte[] p;

    @JsonProperty("p")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getP() {
        return p;
    }

    public void setP(byte[] p) {
        this.p = p;
    }

    private byte[] q;

    @JsonProperty("q")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getQ() {
        return q;
    }

    public void setQ(byte[] q) {
        this.q = q;
    }

    private byte[] k;

    @JsonProperty("k")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getk() {
        return k;
    }

    public void setK(byte[] k) {
        this.k = k;
    }

    private byte[] t;

    @JsonProperty("key_hsm")
    @JsonSerialize(using = Base64UrlSerializer.class)
    @JsonDeserialize(using = Base64UrlDeserializer.class)
    public byte[] getT() {
        return t;
    }

    public void setT(byte[] t) {
        this.t = t;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            throw new IllegalStateException(e);
        } catch (JsonMappingException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
