#!/usr/bin/env python
# coding: utf-8

# # Video to Audio (wav) Conversation

# ### It is very difficult for many of the individuals, those who wants to listen and don't want to watch video's. They might be UPSC aspirants who want to do multitasking or news listners or you !!!
# 
# #### This code allows users to input video file and related audio file will be generated on the basis of given input file

# ### Importing dependencies

# In[ ]:


get_ipython().run_line_magic('matplotlib', 'inline')
import moviepy.editor as mp
import IPython.display as ipd
import librosa, librosa.display


# ### File Conversation

# In[7]:


# Enter video path & store in clip variable
clip = mp.VideoFileClip(r"videorec.mp4")

# creating new wav-audio file and saving in same directory
clip.audio.write_audiofile(r"converted.wav")


# In[17]:


# Displaying UI Tool for playing Video to Audio converted file
x, sr = librosa.load('converted.wav')
ipd.Audio(x, rate=sr)


# ### End
