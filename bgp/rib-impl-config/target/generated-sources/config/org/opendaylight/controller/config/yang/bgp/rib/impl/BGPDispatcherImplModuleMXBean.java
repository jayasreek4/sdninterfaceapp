/*
* Generated file
*
* Generated from: yang module name: bgp-rib-impl yang module local name: bgp-dispatcher-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 30 11:43:55 IST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.bgp.rib.impl;
public interface BGPDispatcherImplModuleMXBean {
    public javax.management.ObjectName getWorkerGroup();

    public void setWorkerGroup(javax.management.ObjectName workerGroup);

    public javax.management.ObjectName getTimer();

    public void setTimer(javax.management.ObjectName timer);

    public javax.management.ObjectName getBgpExtensions();

    public void setBgpExtensions(javax.management.ObjectName bgpExtensions);

    public javax.management.ObjectName getMd5ChannelFactory();

    public void setMd5ChannelFactory(javax.management.ObjectName md5ChannelFactory);

    public javax.management.ObjectName getBossGroup();

    public void setBossGroup(javax.management.ObjectName bossGroup);

    public javax.management.ObjectName getMd5ServerChannelFactory();

    public void setMd5ServerChannelFactory(javax.management.ObjectName md5ServerChannelFactory);

}