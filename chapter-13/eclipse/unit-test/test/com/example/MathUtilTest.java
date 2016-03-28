package com.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MathUtilTest {
    
    @Test
    public void testMultiply() {
        MathHelper mathHelper = mock(MathHelper.class);
        for (int i = 0; i < 10; i++) {
            when(mathHelper.add(i * 8, 8)).thenReturn(i * 8 + 8);
        }
        MathUtil mathUtil = new MathUtil(mathHelper);
        mathUtil.multiply(3, 8);
        verify(mathHelper, times(1)).add(0, 8);
        verify(mathHelper, times(1)).add(8, 8);
        verify(mathHelper, times(1)).add(16, 8);
    }
}
