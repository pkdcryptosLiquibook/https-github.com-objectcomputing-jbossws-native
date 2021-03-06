/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.interop.nov2007.wsse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IPingService", targetNamespace = "http://InteropBaseAddress/interop")
public interface IPingService {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.jboss.test.ws.interop.nov2007.wsse.PingResponse
     */
    @WebMethod(operationName = "Ping", action = "http://xmlsoap.org/Ping")
    @WebResult(name = "PingResponse", targetNamespace = "http://InteropBaseAddress/interop", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://xmlsoap.org/Ping", output = "http://xmlsoap.org/Ping")
    public PingResponse ping(
        @WebParam(name = "PingRequest", targetNamespace = "http://InteropBaseAddress/interop", partName = "parameters")
        PingRequest parameters);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://InteropBaseAddress/interop/echo")
    @WebResult(name = "echoResult", targetNamespace = "http://InteropBaseAddress/interop")
    @RequestWrapper(localName = "echo", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.EchoResponse")
    @Action(input = "http://InteropBaseAddress/interop/echo", output = "http://InteropBaseAddress/interop/echo")
    public String echo(
        @WebParam(name = "request", targetNamespace = "http://InteropBaseAddress/interop")
        String request);

    /**
     * 
     * @param request
     * @return
     *     returns org.jboss.test.ws.interop.nov2007.wsse.EchoXmlResponse.EchoXmlResult
     */
    @WebMethod(action = "http://InteropBaseAddress/interop/echoXml")
    @WebResult(name = "echoXmlResult", targetNamespace = "http://InteropBaseAddress/interop")
    @RequestWrapper(localName = "echoXml", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.EchoXml")
    @ResponseWrapper(localName = "echoXmlResponse", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.EchoXmlResponse")
    @Action(input = "http://InteropBaseAddress/interop/echoXml", output = "http://InteropBaseAddress/interop/echoXml")
    public org.jboss.test.ws.interop.nov2007.wsse.EchoXmlResponse.EchoXmlResult echoXml(
        @WebParam(name = "request", targetNamespace = "http://InteropBaseAddress/interop")
        org.jboss.test.ws.interop.nov2007.wsse.EchoXml.Request request);

    /**
     * 
     * @param request
     * @return
     *     returns org.jboss.test.ws.interop.nov2007.wsse.EchoDataSetResponse.EchoDataSetResult
     */
    @WebMethod(action = "http://InteropBaseAddress/interop/echoDataSet")
    @WebResult(name = "echoDataSetResult", targetNamespace = "http://InteropBaseAddress/interop")
    @RequestWrapper(localName = "echoDataSet", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.EchoDataSet")
    @ResponseWrapper(localName = "echoDataSetResponse", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.EchoDataSetResponse")
    @Action(input = "http://InteropBaseAddress/interop/echoDataSet", output = "http://InteropBaseAddress/interop/echoDataSet")
    public org.jboss.test.ws.interop.nov2007.wsse.EchoDataSetResponse.EchoDataSetResult echoDataSet(
        @WebParam(name = "request", targetNamespace = "http://InteropBaseAddress/interop")
        org.jboss.test.ws.interop.nov2007.wsse.EchoDataSet.Request request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://InteropBaseAddress/interop/header")
    @WebResult(name = "headerResult", targetNamespace = "http://InteropBaseAddress/interop")
    @RequestWrapper(localName = "header", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.Header")
    @ResponseWrapper(localName = "headerResponse", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.HeaderResponse")
    @Action(input = "http://InteropBaseAddress/interop/header", output = "http://InteropBaseAddress/interop/headerResponse")
    public String header(
        @WebParam(name = "request", targetNamespace = "http://InteropBaseAddress/interop")
        String request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://InteropBaseAddress/interop/fault")
    @WebResult(name = "faultResult", targetNamespace = "http://InteropBaseAddress/interop")
    @RequestWrapper(localName = "fault", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.Fault")
    @ResponseWrapper(localName = "faultResponse", targetNamespace = "http://InteropBaseAddress/interop", className = "org.jboss.test.ws.interop.nov2007.wsse.FaultResponse")
    @Action(input = "http://InteropBaseAddress/interop/fault", output = "http://InteropBaseAddress/interop/faultResponse")
    public String fault(
        @WebParam(name = "request", targetNamespace = "http://InteropBaseAddress/interop")
        String request);

}
