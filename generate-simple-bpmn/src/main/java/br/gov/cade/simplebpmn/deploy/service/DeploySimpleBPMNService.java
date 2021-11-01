package br.gov.cade.simplebpmn.deploy.service;

import org.camunda.bpm.engine.impl.persistence.deploy.Deployer;
import org.camunda.bpm.engine.impl.persistence.entity.DeploymentEntity;
import java.util.logging.Logger;

public class DeploySimpleBPMNService implements Deployer {

	@Override
	public void deploy(DeploymentEntity deployment) {
		// TODO Auto-generated method stub

		 final Logger LOGGER =  Logger.getLogger(DeploySimpleBPMNService.class.getName());
		 LOGGER.info("\n\n Deploing SimpleBPMN");
		 
		 System.out.println("Deploing SimpleBPMN....");
		 
				 
	}
	
	// public ProcessEngineConfigurationImpl setCustomPostDeployers(List<Deployer> customPostDeployers) {
	//	    this.customPostDeployers = customPostDeployers;
	//	    return this;
	//	  }
	
	
}
