
package com.linagora.pocejbcawsclient.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CAOfflineException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class CAOfflineException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CAOfflineException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CAOfflineException_Exception(String message, CAOfflineException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CAOfflineException_Exception(String message, CAOfflineException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.linagora.pocejbcawsclient.gen.CAOfflineException
     */
    public CAOfflineException getFaultInfo() {
        return faultInfo;
    }

}