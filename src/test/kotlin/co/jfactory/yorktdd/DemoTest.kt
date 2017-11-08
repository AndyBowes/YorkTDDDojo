package co.jfactory.yorktdd

import org.hamcrest.CoreMatchers.not
import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.CoreMatchers.startsWith
import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.CoreMatchers.hasItems
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo


import org.junit.Test

class DemoTest {

    @Test fun `Given an Example When I Do Something Then I Expect Result`(){
        assertThat(false, not(equalTo(true)))
        assertThat(null, nullValue())
        assertThat( null, )
    }
}

