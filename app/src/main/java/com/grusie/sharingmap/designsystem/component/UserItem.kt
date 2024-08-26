package com.grusie.sharingmap.designsystem.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.grusie.sharingmap.designsystem.theme.Black
import com.grusie.sharingmap.designsystem.theme.Typography

@Composable
fun UserItem(
    profileImage: String,
    name: String,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier.padding(vertical = 8.dp, horizontal = 20.dp)) {
        AsyncImage(
            model = profileImage,
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .clip(RoundedCornerShape(8.dp)),
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = name,
            style = Typography.bodySmall,
            color = Black,
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically),
        )
    }
}

@Preview
@Composable
private fun UserItemPreview() {
    UserItem(profileImage = "", name = "김서현", modifier = Modifier.fillMaxWidth())
}
