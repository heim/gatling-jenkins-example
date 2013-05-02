# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.define :jenkins do |jenkins|
    jenkins.vm.box = "precise32"
    jenkins.vm.box_url = "http://files.vagrantup.com/precise32.box"
    jenkins.vm.network :private_network, ip: "192.168.1.1"
    jenkins.vm.network :forwarded_port, guest: 8080, host: 8081
    jenkins.vm.hostname = "jenkins"
  end

  config.vm.define :slave do |slave|
    slave.vm.box = "precise32"
    slave.vm.box_url = "http://files.vagrantup.com/precise32.box"
    slave.vm.network :private_network, ip: "192.168.1.3"
    slave.vm.hostname = "slave"
  end
  
  config.vm.define :web do |web|
    web.vm.box = "precise32"
    web.vm.box_url = "http://files.vagrantup.com/precise32.box"
    web.vm.network :private_network, ip: "192.168.1.2"
    web.vm.hostname = "web"
  end
end
