package com.rnta.gpao.service;

import java.util.List;


import com.rnta.gpao.entities.Machine;

public interface MachineService {
	
	List<Machine> getAllMachine();
	Machine getMachineById(long id);
	void deleteMachineById(long id);
	Machine updateMachine(Machine atelier);
	Machine saveMachine(Machine machine);

}
