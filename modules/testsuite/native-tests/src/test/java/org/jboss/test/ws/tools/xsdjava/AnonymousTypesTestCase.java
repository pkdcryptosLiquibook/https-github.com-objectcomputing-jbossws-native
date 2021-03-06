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
package org.jboss.test.ws.tools.xsdjava;
 
import java.io.File;

import org.jboss.test.ws.tools.WSToolsBase;
import org.jboss.test.ws.tools.fixture.JBossSourceComparator;
import org.jboss.ws.core.jaxrpc.LiteralTypeMapping;
import org.jboss.ws.tools.XSDToJava;
import org.jboss.ws.tools.interfaces.XSDToJavaIntf;

/** Testcase that generates XSD -> Java Types
 *  Then uses the JBossSourceComparator to check the
 *  Java Types against the ones generated by wscompile
 *  [JBWS-147] XSDSchema to Java comprehensive test collection
 *  @author <mailto:Anil.Saldhana@jboss.org>Anil Saldhana
 *  @since  Mar 10, 2005
 */
public class AnonymousTypesTestCase extends WSToolsBase
{ 
   protected String genPath = "tools/xsd-java-checker/jbossws/anontypes";
   
   protected XSDToJavaIntf xsdJava = new XSDToJava();
   /**
    * Tests Use of Anonymous Types
    * @throws Exception
    */
   public void testXSAnonTypes() throws Exception
   {
      String filename = "AnonTypes.xsd";
      String packagename = "org.jboss.ws.types";
      String schemaFile = getResourceFile("tools/xsd/anontypes/" + filename).getAbsolutePath();
     
      String genPath = "tools/xsd-java-checker/jbossws/anontypes/";
      this.mkdirs(genPath);
      File dir = createResourceFile(genPath);
      xsdJava.setTypeMapping(new LiteralTypeMapping());
      xsdJava.generateJavaSource(schemaFile, dir, packagename, true);

      //Compare the generated Java type against the one generated by wscompile
      String fname = "Items.java";
      File file2 = createResourceFile(genPath + "/org/jboss/ws/types/" + fname);
      File file1 = getResourceFile("tools/xsd-java-checker/wscompile/anontypes/" + fname);
      JBossSourceComparator sc = new JBossSourceComparator(file1, file2);
      assertTrue("Source Files Match:", sc.validate());
      sc.validateImports();

      //Compare the generated Java type against the one generated by wscompile
      fname = "ItemsItem.java";
      file2 = createResourceFile(genPath  + "/org/jboss/ws/types/" + fname);
      file1 = getResourceFile("tools/xsd-java-checker/wscompile/anontypes/" + fname);
      sc = new JBossSourceComparator(file1, file2);
      assertTrue("Source Files Match:", sc.validate());
      sc.validateImports();
   }
}
