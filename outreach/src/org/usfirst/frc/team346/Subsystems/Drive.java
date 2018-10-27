package org.usfirst.frc.team346.Subsystems;

//import org.usfirst.frc.team346.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

//import edu.wpi.first.wpilibj.XboxController;

public class Drive {
	private TalonSRX[] driveLeft;
	private TalonSRX[] driveRight;
	
	public Drive() {
		this.init();
	}
	public void driveRightSide(double amount) {
		driveRight[0].set(ControlMode.PercentOutput, amount);
//		this.sDriveRight1.follow(mDriveRight);
//		this.sDriveRight2.follow(mDriveRight);
	}
	public void driveLeftSide(double amount) {
		this.driveLeft[0].set(ControlMode.PercentOutput, amount);
//		this.sDriveLeft1.follow(mDriveLeft);
		//this.sDriveLeft2.follow(mDriveLeft);
	}
	public void init() {
		this.mDriveLeft = new TalonSRX(21);
		this.sDriveLeft1 = new TalonSRX(22);
		this.sDriveLeft2 = new TalonSRX(3);
		this.sDriveLeft1.set(ControlMode.Follower, 21);
		this.sDriveLeft1.follow(mDriveLeft);
		this.sDriveLeft2.set(ControlMode.Follower, 21);
		this.sDriveLeft2.follow(mDriveLeft);
		this.mDriveRight = new TalonSRX(5);
		this.sDriveRight1 = new TalonSRX(8);
		this.sDriveRight2 = new TalonSRX(7);
		this.sDriveRight1.set(ControlMode.Follower, 5);
		this.sDriveRight1.follow(mDriveRight);
		this.sDriveRight2.set(ControlMode.Follower, 5);
		this.sDriveRight2.follow(mDriveRight);
		this.driveLeftSide(0);
		this.driveRightSide(0);
		
	}
}
