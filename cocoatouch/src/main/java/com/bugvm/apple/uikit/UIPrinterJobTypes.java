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
package com.bugvm.apple.uikit;

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
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIPrinterJobTypes/*</name>*/ extends Bits</*<name>*/UIPrinterJobTypes/*</name>*/> {
    /*<values>*/
    public static final UIPrinterJobTypes Unknown = new UIPrinterJobTypes(0L);
    public static final UIPrinterJobTypes Document = new UIPrinterJobTypes(1L);
    public static final UIPrinterJobTypes Envelope = new UIPrinterJobTypes(2L);
    public static final UIPrinterJobTypes Label = new UIPrinterJobTypes(4L);
    public static final UIPrinterJobTypes Photo = new UIPrinterJobTypes(8L);
    public static final UIPrinterJobTypes Receipt = new UIPrinterJobTypes(16L);
    public static final UIPrinterJobTypes Roll = new UIPrinterJobTypes(32L);
    public static final UIPrinterJobTypes LargeFormat = new UIPrinterJobTypes(64L);
    public static final UIPrinterJobTypes Postcard = new UIPrinterJobTypes(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UIPrinterJobTypes/*</name>*/[] values = _values(/*<name>*/UIPrinterJobTypes/*</name>*/.class);

    public /*<name>*/UIPrinterJobTypes/*</name>*/(long value) { super(value); }
    private /*<name>*/UIPrinterJobTypes/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIPrinterJobTypes/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIPrinterJobTypes/*</name>*/(value, mask);
    }
    protected /*<name>*/UIPrinterJobTypes/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIPrinterJobTypes/*</name>*/[] values() {
        return values.clone();
    }
}
