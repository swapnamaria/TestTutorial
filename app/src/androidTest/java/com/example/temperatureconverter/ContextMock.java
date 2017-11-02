package com.example.temperatureconverter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * Created by mukraswa on 11/2/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ContextMock {

    @Test
    public void shouldContainExtras() throws Exception {
        Context context = mock(Context.class);
        Intent intent = MainActivity.CreateIntent(context,"C","212");
        assertNotNull(intent);

        Bundle extras = intent.getExtras();
        assertNotNull(extras);

        assertEquals("C", extras.getString("selRadio"));
        assertEquals("212", extras.getString("VALUE"));

    }
}
