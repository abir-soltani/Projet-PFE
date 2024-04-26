package com.rnta.gpao.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rnta.gpao.entities.Machine;
import com.rnta.gpao.repository.MachineRepository;




@Service
public class MachineServiceImpl implements MachineService {
	
   @Autowired
	private MachineRepository machineRepository;
	@Override
	public List<Machine> getAllMachine() {
		
		return machineRepository.findAll();
	}
	
	@Override
	public Machine saveMachine(Machine machine) {
		return machineRepository.save(machine);
		
	}
	@Override
	public Machine getMachineById(long id) {
		Optional<Machine> optional = machineRepository.findById(id);
		Machine machine = null;
		if(optional.isPresent()) {
			machine =  optional.get();
		}else {
			throw new RuntimeException("Machine n'est pas trouvée par l'id ::"+ id);
		}
		return machine ;
	}
	@Override
	public void deleteMachineById(long id) {
		this.machineRepository.deleteById(id);
		
	}

	@Override
	public Machine updateMachine(Machine machine) {
		return machineRepository.save(machine);
	}

	
}
