package com.github.masa_kunikata.html5val.util;

public class MockURLBuilder {

    private MockURL url = new MockURL();

    public MockURLBuilder withRegexp(String regexp) {
        url.setRegexp(regexp);
        return this;
    }

    public MockURLBuilder withProtocol(String protocol) {
        url.setProtocol(protocol);
        return this;
    }

    public MockURLBuilder withHost(String host) {
        url.setHost(host);
        return this;
    }

    public MockURLBuilder withPort(int port) {
        url.setPort(port);
        return this;
    }

    public MockURL build() {
        return url;
    }
}
