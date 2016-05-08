package com.vg.js.node;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class NodeUrl {
    public String href; //: The full URL that was originally parsed. Both the protocol and host are lowercased.

    //Example: 'http://user:pass@host.com:8080/p/a/t/h?query=string#hash'

    public String protocol; //: The request protocol, lowercased.

    //    Example: 'http:'

    public Boolean slashes; //: The protocol requires slashes after the colon.

    //Example: true or false

    public String host; //: The full lowercased host portion of the URL, including port information.

    //Example: 'host.com:8080'

    public String auth; //: The authentication information portion of a URL.

    //Example: 'user:pass'

    public String hostname; //: Just the lowercased hostname portion of the host.

    //Example: 'host.com'

    public Integer port; //: The port number portion of the host.

    //Example: '8080'

    public String pathname; //: The path section of the URL, that comes after the host and before the query, including the initial slash if present. No decoding is performed.

    //Example: '/p/a/t/h'

    public String search; //: The 'query string' portion of the URL, including the leading question mark.

    //Example: '?query=string'

    public String path; //: Concatenation of pathname and search. No decoding is performed.

    //Example: '/p/a/t/h?query=string'

    public String query; //: Either the 'params' portion of the query string, or a querystring-parsed object.

    // Example: 'query=string' or {'query':'string'}

    public String hash; //: The 'fragment' portion of the URL including the pound-sign.

    //Example: '#hash'

}
