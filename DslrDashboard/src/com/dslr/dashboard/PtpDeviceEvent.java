package com.dslr.dashboard;

public enum PtpDeviceEvent {
	PtpDeviceInitialized,
	PtpDeviceStoped,
	PrefsLoaded,
	LiveviewStart,
	LiveviewStop,
	SdCardInserted,
	SdCardRemoved,
	SdCardInfoUpdated,
	MovieRecordingStart,
	MovieRecordingEnd,
	BusyBegin,
	BusyEnd,
	RecordingDestinationChanged,
	CaptureInitiated,
	CaptureStart,
	ObjectAdded,
	ObjectAddedInSdram,
	CaptureComplete,
	CaptureCompleteInSdram,
	GetObjectFromSdramInfo,
	GetObjectFromSdramThumb,
	GetObjectFromSdramProgress,
	GetObjectFromSdramFinished,
	GetObjectFromCamera,
	GetObjectFromCameraProgress,
	GetObjectFromCameraFinished,
	TimelapseStarted,
	TimelapseStoped,
	TimelapseEvent
}