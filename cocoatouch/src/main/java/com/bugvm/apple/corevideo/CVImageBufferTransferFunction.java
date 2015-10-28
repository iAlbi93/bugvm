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
package com.bugvm.apple.corevideo;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.corefoundation.CFArray;
import com.bugvm.apple.corefoundation.CFMutableArray;
import com.bugvm.apple.corefoundation.CFString;
import com.bugvm.apple.corefoundation.CFType;
import com.bugvm.apple.foundation.GlobalValueEnumeration;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CVImageBufferTransferFunction/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBufferTransferFunction/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CVImageBufferTransferFunction/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVImageBufferTransferFunction toObject(Class<CVImageBufferTransferFunction> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CVImageBufferTransferFunction.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CVImageBufferTransferFunction o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVImageBufferTransferFunction> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVImageBufferTransferFunction> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CVImageBufferTransferFunction.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVImageBufferTransferFunction> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVImageBufferTransferFunction o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVImageBufferTransferFunction ITU_R_709_2 = new CVImageBufferTransferFunction("ITU_R_709_2");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVImageBufferTransferFunction SMPTE_240M_1995 = new CVImageBufferTransferFunction("SMPTE_240M_1995");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVImageBufferTransferFunction UseGamma = new CVImageBufferTransferFunction("UseGamma");
    /*</constants>*/
    
    private static /*<name>*/CVImageBufferTransferFunction/*</name>*/[] values = new /*<name>*/CVImageBufferTransferFunction/*</name>*/[] {/*<value_list>*/ITU_R_709_2, SMPTE_240M_1995, UseGamma/*</value_list>*/};
    
    /*<name>*/CVImageBufferTransferFunction/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CVImageBufferTransferFunction/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CVImageBufferTransferFunction/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CVImageBufferTransferFunction/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferTransferFunction_ITU_R_709_2", optional=true)
        public static native CFString ITU_R_709_2();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferTransferFunction_SMPTE_240M_1995", optional=true)
        public static native CFString SMPTE_240M_1995();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferTransferFunction_UseGamma", optional=true)
        public static native CFString UseGamma();
        /*</values>*/
    }
}