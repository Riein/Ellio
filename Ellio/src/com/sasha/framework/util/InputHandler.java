package com.sasha.framework.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.sasha.game.state.State;

public class InputHandler implements KeyListener, MouseListener {

	private State currentState;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		currentState.onClick(e);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		currentState.onKeyPress(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentState.onKeyRelease(e);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

}
