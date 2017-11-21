# Spring Boot Application With Consul
The Above is a Consul Integrated Spring Boot Application. I would Have Spring Tool Suite(STS) as my Ide to Import the following code as STS give
more flexibility for Spring Based Applications.

There is Application.yml and BootStrap.yml that are configured according to support SSL handshake and Consul.
There are also Required Depedencies added for the application(Spring-cloud-starter-all) and annotation @EnableDiscoveryClient to make it consul 
Discoverable.



#Consul Side Configurations
Consul Versions Used: Previous 0.9.3 and Now 1.0.1 RC1 Release.

The Consul Has Client Certificates in the Config.Json and required properties accordingly


{
	"datacenter": "dc1",
	"data_dir": "C:\\data_dir3",
	"log_level": "INFO",
	"node_name": "localserver",
	"encrypt": "mrTAh3MJ9Sma6YB74uH8EQ==",
	"ca_file": "C:\\Certs\\nivedan_certs\\ca.cer",
	"cert_file": "C:\\Certs\\nivedan_certs\\consul-san.cer",
	"key_file": "C:\\Certs\\nivedan_certs\\consul-san.key",
	"verify_incoming": true,
	"verify_outgoing": true,
	"server": true,
	"bootstrap": true,
	"ports": {
		"dns": -1,
		"http": 9500,
        "https": 8080,
		"serf_lan": 9301,
		"serf_wan": 9302,
		"server": 9300
	}



Note:
The above Configurations work fine for one Way SSL Hanshake , for 2 way ssl We get a bad cert error

