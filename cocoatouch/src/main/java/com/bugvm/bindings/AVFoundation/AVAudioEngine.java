/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.bindings.AVFoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioEngine/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeConfigurationChange(AVAudioEngine object, final VoidBlock1<AVAudioEngine> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ConfigurationChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVAudioEngine)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVAudioEnginePtr extends Ptr<AVAudioEngine, AVAudioEnginePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioEngine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioEngine() {}
    protected AVAudioEngine(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "musicSequence")
    public native MusicSequence getMusicSequence();
    @WeaklyLinked
    @Property(selector = "setMusicSequence:")
    public native void setMusicSequence(MusicSequence v);
    @Property(selector = "outputNode")
    public native AVAudioOutputNode getOutputNode();
    @Property(selector = "inputNode")
    public native AVAudioInputNode getInputNode();
    @Property(selector = "mainMixerNode")
    public native AVAudioMixerNode getMainMixerNode();
    @Property(selector = "isRunning")
    public native boolean isRunning();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="AVAudioEngineConfigurationChangeNotification", optional=true)
    public static native NSString ConfigurationChangeNotification();
    
    @Method(selector = "attachNode:")
    public native void attachNode(AVAudioNode node);
    @Method(selector = "detachNode:")
    public native void detachNode(AVAudioNode node);
    @Method(selector = "connect:to:fromBus:toBus:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, @MachineSizedUInt long bus1, @MachineSizedUInt long bus2, AVAudioFormat format);
    @Method(selector = "connect:to:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, AVAudioFormat format);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "connect:toConnectionPoints:fromBus:format:")
    public native void connect(AVAudioNode sourceNode, NSArray<AVAudioConnectionPoint> destNodes, @MachineSizedUInt long sourceBus, AVAudioFormat format);
    @Method(selector = "disconnectNodeInput:bus:")
    public native void disconnectNodeInput(AVAudioNode node, @MachineSizedUInt long bus);
    @Method(selector = "disconnectNodeInput:")
    public native void disconnectNodeInput(AVAudioNode node);
    @Method(selector = "disconnectNodeOutput:bus:")
    public native void disconnectNodeOutput(AVAudioNode node, @MachineSizedUInt long bus);
    @Method(selector = "disconnectNodeOutput:")
    public native void disconnectNodeOutput(AVAudioNode node);
    @Method(selector = "prepare")
    public native void prepare();
    public boolean start() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = start(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startAndReturnError:")
    private native boolean start(NSError.NSErrorPtr outError);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "stop")
    public native void stop();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "inputConnectionPointForNode:inputBus:")
    public native AVAudioConnectionPoint getInputConnectionPoint(AVAudioNode node, @MachineSizedUInt long bus);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "outputConnectionPointsForNode:outputBus:")
    public native NSArray<AVAudioConnectionPoint> getOutputConnectionPoints(AVAudioNode node, @MachineSizedUInt long bus);
    /*</methods>*/
}
