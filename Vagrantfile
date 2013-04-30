# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.define :jenkins do |jenkins|
    jenkins.vm.box = "precise32"
    jenkins.vm.box_url = "http://files.vagrantup.com/precise32.box"
    jenkins.vm.network :private_network, ip: "192.168.1.1"
  end

  config.vm.define :gatling do |gatling|
    gatling.vm.box = "precise32"
    gatling.vm.box_url = "http://files.vagrantup.com/precise32.box"
    gatling.vm.network :private_network, ip: "192.168.1.2"
  end
end
