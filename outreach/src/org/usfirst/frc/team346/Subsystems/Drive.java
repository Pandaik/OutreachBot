package org.usfirst.frc.team346.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.XboxController;

public class Drive {
	private TalonSRX mDriveLeft, sDriveLeft1, sDriveLeft2;
	private TalonSRX mDriveRight, sDriveRight1, sDriveRight2;
	private XboxController xbx;
	public Drive() {
		this.init();
		
	}
	public void driveRightSide(double amount) {
		mDriveRight.set(ControlMode.PercentOutput, amount);
		sDriveRight1.follow(mDriveRight);
		sDriveRight2.follow(mDriveRight);
	}
	public void driveLeftSide(double amount) {
		mDriveLeft.set(ControlMode.PercentOutput, amount);
		sDriveLeft1.follow(mDriveLeft);
		sDriveLeft2.follow(mDriveLeft);
	}
	public void init() {
//		mDriveLeft = new TalonSRX();
		this.driveLeftSide(0);
		this.driveRightSide(0);
	}
	public void move() {
		
	}
}
