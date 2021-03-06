/**
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.mobicents.ussdgateway.slee.test;

import org.mobicents.protocols.ss7.map.api.MAPApplicationContext;
import org.mobicents.protocols.ss7.map.api.MAPApplicationContextName;
import org.mobicents.protocols.ss7.map.api.MAPApplicationContextVersion;
import org.mobicents.protocols.ss7.map.api.datacoding.CBSDataCodingScheme;
import org.mobicents.protocols.ss7.map.api.primitives.AddressString;
import org.mobicents.protocols.ss7.map.api.primitives.USSDString;
import org.mobicents.protocols.ss7.map.api.service.supplementary.ProcessUnstructuredSSRequest;
import org.mobicents.protocols.ss7.map.datacoding.CBSDataCodingSchemeImpl;
import org.mobicents.protocols.ss7.map.primitives.USSDStringImpl;
import org.mobicents.protocols.ss7.map.service.supplementary.ProcessUnstructuredSSRequestImpl;
import org.mobicents.protocols.ss7.sccp.parameter.SccpAddress;
import org.mobicents.ussdgateway.XmlMAPDialog;
import org.mobicents.ussdgateway.rules.ScRoutingRule;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public class A1Test {

    SipSbbProxy sbb;

    @BeforeMethod
    public void setUpClass() throws Exception {
        System.out.println("setUpClass");

        this.sbb = new SipSbbProxy();
    }

    @AfterMethod
    public void tearDownClass() throws Exception {
        System.out.println("tearDownClass");
    }

    @Test(groups = { "Test" })
    public void test1() throws Exception {
//        ScRoutingRule call = new ScRoutingRule();
//        call.setSipProxy("127.0.0.1:6081");
//
//        SccpAddress localAddress = null;
//        SccpAddress remoteAddress = null;
//        AddressString destReference = null;
//        AddressString origReference = null;
//        XmlMAPDialog xmlMAPDialog = new XmlMAPDialog(MAPApplicationContext.getInstance(MAPApplicationContextName.networkUnstructuredSsContext,
//                MAPApplicationContextVersion.version2), localAddress, remoteAddress, 1L, 10001L, destReference, origReference);
//
//        CBSDataCodingScheme dcs = new CBSDataCodingSchemeImpl(15);
//        USSDString ussdString = new USSDStringImpl("*123#11111#", dcs, null);
//        ProcessUnstructuredSSRequest mapMessage = new ProcessUnstructuredSSRequestImpl(dcs, ussdString, null, null);
//        xmlMAPDialog.addMAPMessage(mapMessage);
//
//        this.sbb.buildInvite(call, xmlMAPDialog);
    }

}
