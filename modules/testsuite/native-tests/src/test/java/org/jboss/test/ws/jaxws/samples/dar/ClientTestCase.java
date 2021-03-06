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
package org.jboss.test.ws.jaxws.samples.dar;

import java.net.URL;
import java.util.Date;

import junit.framework.Test;

import org.jboss.wsf.test.JBossWSTest;
import org.jboss.wsf.test.JBossWSTestSetup;
import org.jboss.test.ws.jaxws.samples.dar.generated.DarResponse;

/**
 * DAR client; invokes the DAR endpoint (sync, asynch)
 *
 * @author alessio.soldano@jboss.org
 * @since 30-Apr-2008
 */
public class ClientTestCase extends JBossWSTest
{
   public static Test suite()
   {
      return new JBossWSTestSetup(ClientTestCase.class, "jaxws-samples-dar.jar");
   }

   public void testSync() throws Exception
   {
      URL wsdlURL = new URL("http://" + getServerHost() + ":8080/dar?wsdl");
      Client client = new Client(wsdlURL);
      Date start = new Date();
      DarResponse response = client.run(false);
      Date stop = new Date();
      assertTrue(stop.getTime() - start.getTime() > 3000);
      assertNotNull(response);
   }
   
   public void testAsync() throws Exception
   {
      URL wsdlURL = new URL("http://" + getServerHost() + ":8080/dar?wsdl");
      Client client = new Client(wsdlURL);
      Date start = new Date();
      DarResponse response = client.run(true);
      Date stop = new Date();
      assertTrue(stop.getTime() - start.getTime() > 3000);
      assertNotNull(response);
   }
}
